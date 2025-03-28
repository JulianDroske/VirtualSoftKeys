package tw.com.daxia.virtualsoftkeys.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;

import tw.com.daxia.virtualsoftkeys.BuildConfig;


/**
 * Created by daxia on 2016/7/31.
 */
public class SPFManager {

    private static final String SPF_CONFIG_NEME = "CONFIG";
    //Portrait config
    private static final String CONFIG_P_TOUCHVIEW_HEIGHT = "P_TOUCHVIEW_HEIGHT";
    private static final String CONFIG_P_TOUCHVIEW_WIDTH = "P_TOUCHVIEW_WIDTH";
    private static final String CONFIG_P_TOUCHVIEW_POSITION = "P_TOUCHVIEW_POSITION";
    private static final String CONFIG_P_BARVIEW_HEIGHT = "P_BARVIEW_HEIGHT";
    private static final String CONFIG_P_BARVIEW_SPAN_WIDTH = "P_BARVIEW_SPAN_WIDTH";
    //Landscape config
    private static final String CONFIG_L_TOUCHVIEW_HEIGHT = "L_TOUCHVIEW_HEIGHT";
    private static final String CONFIG_L_TOUCHVIEW_WIDTH = "L_TOUCHVIEW_WIDTH";
    private static final String CONFIG_L_TOUCHVIEW_POSITION = "L_TOUCHVIEW_POSITION";
    private static final String CONFIG_L_BARVIEW_HEIGHT = "L_BARVIEW_HEIGHT";
    private static final String CONFIG_L_BARVIEW_SPAN_WIDTH = "L_BARVIEW_SPAN_WIDTH";

    //Shared config
    private static final String CONFIG_STYLUS_ONLY_MODE = "STYLUS_ONLY_MODE";
    //Replace it from bg color
    private static final String CONFIG_TRANSPARENT_BG = "TRANSPARENT_BG";
    private static final String CONFIG_NVBAR_BG_COLOR = "NVBAR_BG_COLOR";

    private static final String CONFIG_DISAPPEAR_TIME = "DISAPPEAR_TIME";
    private static final String CONFIG_SMART_HIDDEN = "SMART_HIDDEN";
    private static final String CONFIG_ROTATE_HIDDEN = "ROTATE_HIDDEN";
    private static final String CONFIG_REVERSE_BUTTON = "REVERSE_BUTTON";


    //Description
    private static final String DESCRIPTION_CLOSE = "DESCRIPTION_CLOSE";


    private static final String SPF_CRASHLOG = "CRASHLOG";
    private static final String CRASHLOG_MESSAGE = "CRASHLOG_MESSAGE";
    private static final String CRASHLOG_LAST_CRASH = "CRASHLOG_LAST_CRASH";


    private static final String SPF_SYSTEM = "SYSTEM";
    private static final String SYSTEM_VERSIONCODE = "VERSIONCODE";
    public static final int DEFAULT_VERSIONCODE = -1;


    /**
     * Portrait Setting Method
     */
    public static int getTouchviewPortraitHeight(Context context) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CONFIG_NEME, 0);
        return settings.getInt(CONFIG_P_TOUCHVIEW_HEIGHT, ScreenHepler.getDefautlTouchviewHeight(context));
    }

    public static void setTouchviewPortraitHeight(Context context, int heightPx) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CONFIG_NEME, 0);
        SharedPreferences.Editor PE = settings.edit();
        PE.putInt(CONFIG_P_TOUCHVIEW_HEIGHT, heightPx);
        PE.commit();
    }

    public static int getTouchviewPortraitWidth(Context context) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CONFIG_NEME, 0);
        return settings.getInt(CONFIG_P_TOUCHVIEW_WIDTH, ScreenHepler.getDefautlTouchviewWidth());
    }

    public static void setTouchviewPortraitWidth(Context context, int widthPx) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CONFIG_NEME, 0);
        SharedPreferences.Editor PE = settings.edit();
        PE.putInt(CONFIG_P_TOUCHVIEW_WIDTH, widthPx);
        PE.commit();
    }

    public static int getTouchviewPortraitPosition(Context context) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CONFIG_NEME, 0);
        //Default width is match_content , so  position = 0
        return settings.getInt(CONFIG_P_TOUCHVIEW_POSITION, 0);
    }

    public static void setTouchviewPortraitPosition(Context context, int position) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CONFIG_NEME, 0);
        SharedPreferences.Editor PE = settings.edit();
        PE.putInt(CONFIG_P_TOUCHVIEW_POSITION, position);
        PE.commit();
    }

    public static int getBarviewPortraitHeight(Context context) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CONFIG_NEME, 0);
        return settings.getInt(CONFIG_P_BARVIEW_HEIGHT, ScreenHepler.getDefautlBarviewHeight(context));
    }

    public static void setBarviewPortraitHeight(Context context, int heightPx) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CONFIG_NEME, 0);
        SharedPreferences.Editor PE = settings.edit();
        PE.putInt(CONFIG_P_BARVIEW_HEIGHT, heightPx);
        PE.commit();
    }

    public static int getBarviewPortraitSpanWidth(Context context) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CONFIG_NEME, 0);
        return settings.getInt(CONFIG_P_BARVIEW_SPAN_WIDTH, ScreenHepler.getDefautlBarviewSpanWidth(context));
    }

    public static void setBarviewPortraitSpanWidth(Context context, int spanWidthPx) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CONFIG_NEME, 0);
        SharedPreferences.Editor PE = settings.edit();
        PE.putInt(CONFIG_P_BARVIEW_SPAN_WIDTH, spanWidthPx);
        PE.commit();
    }


    /**
     * Landscape Setting Method
     */

    public static int getTouchviewLandscapeHeight(Context context) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CONFIG_NEME, 0);
        return settings.getInt(CONFIG_L_TOUCHVIEW_HEIGHT, ScreenHepler.getDefautlTouchviewHeight(context));
    }

    public static void setTouchviewLandscapeHeight(Context context, int heightPx) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CONFIG_NEME, 0);
        SharedPreferences.Editor PE = settings.edit();
        PE.putInt(CONFIG_L_TOUCHVIEW_HEIGHT, heightPx);
        PE.commit();
    }

    public static int getTouchviewLandscapeWidth(Context context) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CONFIG_NEME, 0);
        return settings.getInt(CONFIG_L_TOUCHVIEW_WIDTH, ScreenHepler.getDefautlTouchviewWidth());
    }

    public static void setTouchviewLandscapeWidth(Context context, int widthPx) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CONFIG_NEME, 0);
        SharedPreferences.Editor PE = settings.edit();
        PE.putInt(CONFIG_L_TOUCHVIEW_WIDTH, widthPx);
        PE.commit();
    }

    public static int getTouchviewLandscapePosition(Context context) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CONFIG_NEME, 0);
        //Default width is match_content , so  position = 0
        return settings.getInt(CONFIG_L_TOUCHVIEW_POSITION, 0);
    }

    public static void setTouchviewLandscapePosition(Context context, int position) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CONFIG_NEME, 0);
        SharedPreferences.Editor PE = settings.edit();
        PE.putInt(CONFIG_L_TOUCHVIEW_POSITION, position);
        PE.commit();
    }

    public static int getBarviewLandscapeHeight(Context context) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CONFIG_NEME, 0);
        return settings.getInt(CONFIG_L_BARVIEW_HEIGHT, ScreenHepler.getDefautlBarviewHeight(context));
    }

    public static void setBarviewLandscapeHeight(Context context, int heightPx) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CONFIG_NEME, 0);
        SharedPreferences.Editor PE = settings.edit();
        PE.putInt(CONFIG_L_BARVIEW_HEIGHT, heightPx);
        PE.commit();
    }

    public static int getBarviewLandscapeSpanWidth(Context context) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CONFIG_NEME, 0);
        return settings.getInt(CONFIG_L_BARVIEW_SPAN_WIDTH, ScreenHepler.getDefautlBarviewSpanWidth(context));
    }

    public static void setBarviewLandscapeSpanWidth(Context context, int spanWidthPx) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CONFIG_NEME, 0);
        SharedPreferences.Editor PE = settings.edit();
        PE.putInt(CONFIG_L_BARVIEW_SPAN_WIDTH, spanWidthPx);
        PE.commit();
    }


    /**
     * Shared Setting Method
     */

    public static int getSoftKeyBarBgGolor(Context context) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CONFIG_NEME, 0);
        return settings.getInt(CONFIG_NVBAR_BG_COLOR, Color.BLACK);
    }

    public static void setSoftKeyBgGolor(Context context, int nvBarColor) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CONFIG_NEME, 0);
        SharedPreferences.Editor PE = settings.edit();
        PE.putInt(CONFIG_NVBAR_BG_COLOR, nvBarColor);
        PE.commit();
    }

    public static boolean getStylusOnlyMode(Context context) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CONFIG_NEME, 0);
        return settings.getBoolean(CONFIG_STYLUS_ONLY_MODE, false);
    }

    public static void setStylusOnlyMode(Context context, boolean stylusOnly) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CONFIG_NEME, 0);
        SharedPreferences.Editor PE = settings.edit();
        PE.putBoolean(CONFIG_STYLUS_ONLY_MODE, stylusOnly);
        PE.commit();
    }



    /**
     * Get the disappear time array position
     * @param context
     * @return
     */
    public static int getDisappearPosition(Context context) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CONFIG_NEME, 0);
        //Default position is 0 = DisappearObj.TIME_NEVER
        return settings.getInt(CONFIG_DISAPPEAR_TIME, 0);
    }

    /**
     * Save the disappear time array position
     * @param context
     * @param position by bar_disappear_time
     */
    public static void setDisappearPosition(Context context, int position) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CONFIG_NEME, 0);
        SharedPreferences.Editor PE = settings.edit();
        PE.putInt(CONFIG_DISAPPEAR_TIME, position);
        PE.commit();
    }


    public static boolean getSmartHidden(Context context) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CONFIG_NEME, 0);
        return settings.getBoolean(CONFIG_SMART_HIDDEN, false);
    }

    public static void setSmartHidden(Context context, boolean smartHidden) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CONFIG_NEME, 0);
        SharedPreferences.Editor PE = settings.edit();
        PE.putBoolean(CONFIG_SMART_HIDDEN, smartHidden);
        PE.commit();
    }

    public static boolean getRotateHidden(Context context) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CONFIG_NEME, 0);
        return settings.getBoolean(CONFIG_ROTATE_HIDDEN, false);
    }

    public static void setRotateHidden(Context context, boolean hiddenWhenRotate) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CONFIG_NEME, 0);
        SharedPreferences.Editor PE = settings.edit();
        PE.putBoolean(CONFIG_ROTATE_HIDDEN, hiddenWhenRotate);
        PE.commit();
    }

    public static boolean getReverseFunctionButton(Context context) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CONFIG_NEME, 0);
        return settings.getBoolean(CONFIG_REVERSE_BUTTON, false);
    }

    public static void setReverseFunctionButton(Context context, boolean reverseButton) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CONFIG_NEME, 0);
        SharedPreferences.Editor PE = settings.edit();
        PE.putBoolean(CONFIG_REVERSE_BUTTON, reverseButton);
        PE.commit();
    }



    /**
     * Shared Setting Method
     */

    public static boolean getDescriptionClose(Context context) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CONFIG_NEME, 0);
        return settings.getBoolean(DESCRIPTION_CLOSE, false);
    }

    public static void setDescriptionClose(Context context, boolean close) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CONFIG_NEME, 0);
        SharedPreferences.Editor PE = settings.edit();
        PE.putBoolean(DESCRIPTION_CLOSE, close);
        PE.commit();
    }

    /**
     * CrashLog
     */
    //TODO Add the  Crash trace
    public static void setCrashLog(Context context, String message) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CRASHLOG, 0);
        SharedPreferences.Editor PE = settings.edit();
        PE.putString(CRASHLOG_MESSAGE, message);
        PE.putBoolean(CRASHLOG_LAST_CRASH, true);
        PE.commit();
    }

    public static String getLastCrashLog(Context context) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CRASHLOG, 0);
        SharedPreferences.Editor PE = settings.edit();
        PE.putBoolean(CRASHLOG_LAST_CRASH, false).commit();
        return settings.getString(CRASHLOG_MESSAGE, "");
    }

    public static boolean isLastCrash(Context context) {
        SharedPreferences settings = context.getSharedPreferences(SPF_CRASHLOG, 0);
        return settings.getBoolean(CRASHLOG_LAST_CRASH, false);
    }

    /**
     * For System
     */
    //TODO Add the version trace
    public static void setVersionCode(Context context) {
        SharedPreferences settings = context.getSharedPreferences(SPF_SYSTEM, 0);
        SharedPreferences.Editor PE = settings.edit();
        PE.putInt(SYSTEM_VERSIONCODE, BuildConfig.VERSION_CODE);
        PE.commit();
    }


    public static int getVersionCode(Context context) {
        SharedPreferences settings = context.getSharedPreferences(SPF_SYSTEM, 0);
        return settings.getInt(SYSTEM_VERSIONCODE, DEFAULT_VERSIONCODE);
    }


}
