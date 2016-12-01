package fkn.kopilkagoal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class AddGoalActivity extends AppCompatActivity {
    private ListView lvGoal;
    private GoalAdapter adapter;
    private List<Goal> mGoallist;
    String name,description;
    Integer money;
    Integer id=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_goal);
        lvGoal = (ListView)findViewById(R.id.goal_list);
        mGoallist=new ArrayList<>();
        id=id+1;
    }
    protected void add(View v)
    {
        EditText ename = (EditText) findViewById(R.id.ename);
        if (ename !=null) name = ename.getText().toString();
        EditText emoney = (EditText) findViewById(R.id.enumbermoney);
        if (emoney !=null) money = Integer.parseInt(emoney.getText().toString());
        EditText edesc = (EditText) findViewById(R.id.edescription);
        if (edesc !=null) description=edesc.getText().toString();
        mGoallist.add(new Goal(id,name,money,description));
        adapter=new GoalAdapter(mGoallist,getApplicationContext());
        lvGoal.setAdapter(adapter);
        finish();
    }


}
