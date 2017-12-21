package george.net.george_permission;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author George
 * @date 2017/12/21
 * @email georgejiapeidi@gmail.com
 * @describe 基于AndroidM的危险权限请求接口封装
 */
public class GeorgePermission {
    private Activity mActivity;
    private int mRequestCode;
    private String[] mPermission;

    private GeorgePermission(Activity activity) {
        this.mActivity = activity;
    }
    public static GeorgePermission with(Activity activity) {
        return new GeorgePermission(activity);
    }
    public GeorgePermission addRequestCode(int requestCode) {
        this.mRequestCode = requestCode;
        return this;
    }
    public GeorgePermission permissions(String... permissions) {
        this.mPermission = permissions;
        return this;
    }
    public void request() {
        List<String> deniedPermissions = new ArrayList<>();

        if (Utils.isOverMarshmallow()) {
            deniedPermissions = Utils.findDeniedPermissions(mActivity, mPermission);
            if (deniedPermissions.size() > 0) {
                mActivity.requestPermissions(deniedPermissions.toArray(new String[deniedPermissions.size()]), mRequestCode);
            }
        } else {
            return;
        }
    }
}
