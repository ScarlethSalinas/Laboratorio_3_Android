package com.abc.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

//encargado de registrar el enlace al card item
public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private final List<Source> sourceList;


    private final Button button1;
    private final Button button2;
    private final ImageView image;
    private final TextView title;

    public ViewHolder(@NonNull View itemView, List<Source> sourceList) {
        super(itemView);

        button1 = itemView.findViewById(R.id.button1);
        button2 = itemView.findViewById(R.id.button2);
        image = itemView.findViewById(R.id.image);
        title = itemView.findViewById(R.id.title);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);


        this.sourceList = sourceList;
    }

    ImageView getImage() {
        return image;
    }

    public TextView getTitle() {
        return title;
    }

    @Override
    public void onClick(View v) {

        int position = getAdapterPosition();
        Source source = sourceList.get(position);

        if (v.getId() == button1.getId()) {
            Toast.makeText(button1.getContext(),
                    "Click on option one, item " + position + " for title " + source.getTitle()
                    , Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(button2.getContext(),
                    "Click on option two, item " + position + " for title " + source.getTitle()
                    , Toast.LENGTH_SHORT).show();
        }
    }
}
