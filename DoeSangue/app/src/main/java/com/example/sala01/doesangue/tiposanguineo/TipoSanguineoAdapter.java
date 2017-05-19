package com.example.sala01.doesangue.tiposanguineo;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sala01.doesangue.DownloadImage;
import com.example.sala01.doesangue.DownloadListener;
import com.example.sala01.doesangue.R;

import java.util.List;

/**
 * Created by sala01 on 19/05/2017.
 */

public class TipoSanguineoAdapter extends ArrayAdapter<TipoSanguineoItem> {

    Context context;
    List<TipoSanguineoItem> items;

    public TipoSanguineoAdapter(Context context, List<TipoSanguineoItem> items) {
        super(context, R.layout.item_tipo_sanguineo, items);
        this.context = context;
        this.items = items;
    }

    class ViewHolder{
        ImageView imageViewTipoSanguineo;
        TextView textViewTipoSanguineo;

        public ViewHolder() {
        }

        public ViewHolder(ImageView imageViewTipoSanguineo, TextView textViewTipoSanguineo) {
            this.imageViewTipoSanguineo = imageViewTipoSanguineo;
            this.textViewTipoSanguineo = textViewTipoSanguineo;
        }

        public ImageView getImageViewTipoSanguineo() {
            return imageViewTipoSanguineo;
        }

        public void setImageViewTipoSanguineo(ImageView imageViewTipoSanguineo) {
            this.imageViewTipoSanguineo = imageViewTipoSanguineo;
        }

        public TextView getTextViewTipoSanguineo() {
            return textViewTipoSanguineo;
        }

        public void setTextViewTipoSanguineo(TextView textViewTipoSanguineo) {
            this.textViewTipoSanguineo = textViewTipoSanguineo;
        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        TipoSanguineoItem item = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        final ViewHolder viewHolder; // view lookup cache stored in tag
        if (convertView == null) {
            // If there's no view to re-use, inflate a brand new view for row
            viewHolder = new ViewHolder();

            LayoutInflater inflater = LayoutInflater.from(getContext());

            convertView = inflater.inflate(R.layout.item_tipo_sanguineo, parent, false);

            viewHolder.setTextViewTipoSanguineo((TextView) convertView.findViewById(R.id.textViewTipoSanguineo));
            viewHolder.setImageViewTipoSanguineo((ImageView) convertView.findViewById(R.id.imageViewTipoSanguineo));

            // Cache the viewHolder object inside the fresh view
            convertView.setTag(viewHolder);
        } else {
            // View is being recycled, retrieve the viewHolder object from tag
            viewHolder = (ViewHolder) convertView.getTag();
        }
        // Populate the data from the data object via the viewHolder object
        // into the template view.
        viewHolder.getTextViewTipoSanguineo().setText(item.getText());

        // Imagem
        DownloadImage downloadImage =
                new DownloadImage(
                        context,
                        new DownloadListener(){
                            @Override
                            public void getImg(Bitmap bitmap) {
                                viewHolder.getImageViewTipoSanguineo().setImageBitmap(bitmap);
                            }
                        },
                        item.getImageViewPath()
                );
        downloadImage.execute();

        // Return the completed view to render on screen
        return convertView;
    }
}
