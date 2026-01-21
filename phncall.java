public class MainActivity extends AppCompatActivity{
    private static final StrinName=course_db;

    public DBHandler(context context){
        super(context,DB_name,null,DB_version);
    }

    public void addcourse(cousrsename,courseduration){
        SQLiteDatabase db=this.getWritableDAtabase();
        ContentValues values=new ContentValues();
        values.put(cour_naem,coursename);
        values.put(course_duration,courseduration);
        db.insert(TABLE_NAME,NULL,BV)
    }
uri.fromparts("sms",)
intent.putextra("sms_body",sms.getx)