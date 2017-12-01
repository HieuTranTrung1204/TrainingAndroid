package hieutratrung.com.demolistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 01. Get Listview form UI
        ListView listView = (ListView)findViewById(R.id.listview);

        // 02. Create data source

        // data
        UserAccount user1 = new UserAccount("TrungHieuTran", "admin" , true);

        UserAccount user2 = new UserAccount();
        user2.setUserName("NguyenVanTeo");
        user2.setUserType("Mod");
        user2.setActive(true);
        // data source
        UserAccount[] arr = new UserAccount[]{
                user1,
                user1,
                user1,
                user1,
                user1,
                user1,
                user1,
                user1,
                user1,
                user1,
                user1,
                user1,
                user1,
                user1,
                user1,
                user1,
                user1,
                user1,
                user1,
                user2
        };
        // 03. Create Adapter
        ArrayAdapter<UserAccount> userAccountArrayAdapter = new ArrayAdapter<UserAccount>(this, android.R.layout.simple_list_item_1, arr);

        // 04. Apply adapter for ListView
        listView.setAdapter(userAccountArrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.e("listview","vi tri: "+i);
                Toast.makeText(MainActivity.this, "vi tri: "+i,
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
