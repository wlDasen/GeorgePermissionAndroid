package george.net.george_permission;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;

import java.util.ArrayList;
import java.util.List;

/**
 * @author George
 * @date 2017/12/21
 * @email georgejiapeidi@gmail.com
 * @describe 封装一些基本的功能接口
 */
@TargetApi(Build.VERSION_CODES.M)
public class Utils {
    public static boolean isOverMarshmallow() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.M;
    }
    public static List<String> findDeniedPermissions(Activity activity, String[] permissions) {
        List<String> deniedPermissions = new ArrayList<>();
        for (String permission : permissions) {
            if (activity.checkSelfPermission(permission) != PackageManager.PERMISSION_GRANTED) {
                deniedPermissions.add(permission);
            }
        }
        return deniedPermissions;
    }
}
