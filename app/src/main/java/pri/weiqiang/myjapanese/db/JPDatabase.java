package pri.weiqiang.myjapanese.db;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;


public class JPDatabase extends SQLiteAssetHelper {

    public static final String DB_NAME = "vocab.db";
    public static final String DB_TABLE_GOJUON = "gojuon";
    public static final String DB_TABLE_WORDS = "words";
    public static final String DB_TABLE_LESSONS = "lessons";
    public static final String DB_TABLE_LESSON_TITLE = "lesson_title";
    public static final int DB_VERSON = 1;
    private static JPDatabase mInstance = null;

/*    public JPDatabase(Context context) {

        super(context, DB_NAME, null, DB_VERSON);

    }*/
    //
    /*使用单例模式避免 以下错误A SQLiteConnection object for database '/data/data/.../databases/....db' was leaked!
    Please fix your application to end transactions in progress properly and to close the database when it is no longer needed*/
    public JPDatabase(Context context) {

        super(context, DB_NAME, null, DB_VERSON);

    }


    public synchronized static JPDatabase getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new JPDatabase(context);
        }
        return mInstance;
    };

}
