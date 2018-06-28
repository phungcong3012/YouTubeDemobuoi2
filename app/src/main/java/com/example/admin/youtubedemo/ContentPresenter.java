//package com.example.admin.youtubedemo;
//
//import android.content.Context;
//import android.support.v17.leanback.app.BrowseFragment;
//import android.support.v17.leanback.widget.ListRow;
//import android.support.v17.leanback.widget.Presenter;
//import android.support.v17.leanback.widget.RowHeaderPresenter;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import com.squareup.picasso.Picasso;
//
//import java.net.URI;
//import java.util.ArrayList;
//
//import butterknife.BindView;
//import butterknife.ButterKnife;
//
//public class ContentPresenter extends RowHeaderPresenter {
//  private Context context;
//
//  public ContentPresenter(Context context) {
//    this.context = context;
//  }
//
//  @Override
//  public Presenter.ViewHolder onCreateViewHolder(ViewGroup parent) {
//    return new ViewHolderYoutube(LayoutInflater.from(context).inflate(R.layout.item_content_show, parent, false));
//  }
//
//  @Override
//  public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object item) {
//
//    ContentYouTube contentYouTube = (ContentYouTube) ((ListRow) item).getHeaderItem();
//
//    final ViewHolderYoutube viewHolderYoutube = (ViewHolderYoutube) viewHolder;
//
//    viewHolderYoutube.tvTimeSong.setText(contentYouTube.getmTimeSong());
//    viewHolderYoutube.tvNameSong.setText(contentYouTube.getmNameSong());
//    viewHolderYoutube.tvNameChanel.setText(contentYouTube.getmChannel());
//    viewHolderYoutube.tvPostTime.setText(contentYouTube.getmPostTime() + "");
//    viewHolderYoutube.tvView.setText(contentYouTube.getmView() + "");
// //   Picasso.with(context).load(contentYouTube.getmUrlPicture().toString()).resize(100,200).error(R.drawable.anh1).into(viewHolderYoutube.imgPicture);
//
//    viewHolderYoutube.view.setTag(contentYouTube);
//
//  }
//
//
//  class ViewHolderYoutube extends ViewHolder {
//
//    @BindView(R.id.tv_time_song)
//    TextView tvTimeSong;
//
//    @BindView(R.id.tv_name_song)
//    TextView tvNameSong;
//
//    @BindView(R.id.tv_name_channel)
//    TextView tvNameChanel;
//
//    @BindView(R.id.tv_post_time)
//    TextView tvPostTime;
//
//    @BindView(R.id.tv_view)
//    TextView tvView;
//
//    @BindView(R.id.img_picture_content)
//    ImageView imgPicture;
//
//    public ViewHolderYoutube(View view) {
//      super(view);
//      ButterKnife.bind(this, view);
//    }
//  }
//}
