package fkn.kopilkagoal;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class GoalAdapter extends BaseAdapter {
    private Context mContext;
    private List<Goal> mGoalList;

    public GoalAdapter(List<Goal> mGoalList, Context mContext) {
        this.mGoalList = (List<Goal>) mGoalList;
        this.mContext = (Context) mContext;
    }

    @Override
    public int getCount() {
        return mGoalList.size();
    }

    @Override
    public Object getItem(int position) {
        return mGoalList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(mContext,R.layout.goal_info,null);
        TextView goalName=(TextView)v.findViewById(R.id.goalName);
        TextView goalMoney=(TextView)v.findViewById(R.id.goalMoney);
        TextView goalDate=(TextView)v.findViewById(R.id.goalDate);

        goalName.setText(mGoalList.get(position).getName());
        goalMoney.setText(String.valueOf(mGoalList.get(position).getMoney())+" Рублей ");
        //goalDate.setText(mGoalList.get(position).getDate());

        v.setTag(mGoalList.get(position).getId());
        return v;
    }
}
