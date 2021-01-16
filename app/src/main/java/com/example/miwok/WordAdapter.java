package com.example.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResorceId;


    WordAdapter(Activity context, ArrayList<Word> numberList, int colorResorceId){
        super(context,0,numberList);
        mColorResorceId=colorResorceId;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word local_word = getItem(position);
        TextView miwokTextView =  listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(local_word.getmMiwokTranslation());
        TextView defaultTextView = listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(local_word.getmDefaultTransalation());
        ImageView  imageView = listItemView.findViewById(R.id.image);

        if (local_word.hasImage()) {
            imageView.setImageResource(local_word.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }


        View textContainer =  listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorResorceId);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}
