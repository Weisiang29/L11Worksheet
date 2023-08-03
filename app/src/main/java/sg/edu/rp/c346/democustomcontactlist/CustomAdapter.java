package sg.edu.rp.c346.democustomcontactlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Contact> contactList;
    public CustomAdapter(Context context,int resource,ArrayList<Contact> objects){
        super(context,resource,objects);
        parent_context =context;
        layout_id =resource;
        contactList=objects;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater= (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView =inflater.inflate(layout_id,parent,false);
        TextView tvname= rowView.findViewById(R.id.tvname);
        TextView tvnum= rowView.findViewById(R.id.tvnumber);
        TextView tvcode =rowView.findViewById(R.id.tvcode);
        ImageView ivGender= rowView.findViewById(R.id.imageView2);

        ivGender.setImageResource(R.drawable.female);

        Contact currentItem = contactList.get(position);
        if (currentItem.getGender() == 'M') {
            ivGender.setImageResource(R.drawable.male);
        } else {
            ivGender.setImageResource(R.drawable.female);
        }

        tvname.setText(currentItem.getName());
        tvcode.setText("+"+currentItem.getCountryCode());
        tvnum.setText(currentItem.getPhonenum()+"");
        return rowView;
    }
}
