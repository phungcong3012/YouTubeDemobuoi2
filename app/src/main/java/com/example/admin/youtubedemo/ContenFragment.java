package com.example.admin.youtubedemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v17.leanback.app.BrowseFragment;
import android.support.v17.leanback.app.HeadersSupportFragment;
import android.support.v17.leanback.widget.ArrayObjectAdapter;
import android.support.v17.leanback.widget.HeaderItem;
import android.support.v17.leanback.widget.ListRow;
import android.support.v17.leanback.widget.ListRowPresenter;
import android.support.v17.leanback.widget.Presenter;
import android.support.v17.leanback.widget.PresenterSelector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContenFragment extends BaseRowsFragment {
 // private ArrayObjectAdapter arrayObjectAdapter;

  private List<ContentYouTube> mContentYouTubes;

//  @Override
//  public void onCreate(@Nullable Bundle savedInstanceState) {
//    super.onCreate(savedInstanceState);
//    setPresenterSelector(new PresenterSelector() {
//      @Override
//      public Presenter getPresenter(Object item) {
//        return new ContentPresenter(getActivity());
//      }
//    });
//  }

  @Override
  public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    setupHeaderAdapter();

    // getVerticalGridView().setColumnWidth(2);
  }

  private void setupHeaderAdapter() {
   // arrayObjectAdapter = new ArrayObjectAdapter();
    mContentYouTubes = new ArrayList<>();

    mContentYouTubes.add(new ContentYouTube("2:30", "Noi ay con tim ve", "Am nhac", 200, 3, "https://otakukart.com/wp-content/uploads/2017/08/one_piece_movie_z_luffy_by_exalmas-d61qk9b.png"));
    mContentYouTubes.add(new ContentYouTube("2:30", "Noi ay con tim ve", "Am nhac", 200, 3, "https://otakukart.com/wp-content/uploads/2017/08/one_piece_movie_z_luffy_by_exalmas-d61qk9b.png"));
    mContentYouTubes.add(new ContentYouTube("2:30", "Noi ay con tim ve", "Am nhac", 200, 3, "https://otakukart.com/wp-content/uploads/2017/08/one_piece_movie_z_luffy_by_exalmas-d61qk9b.png"));
    mContentYouTubes.add(new ContentYouTube("2:30", "Noi ay con tim ve", "Am nhac", 200, 3, "https://otakukart.com/wp-content/uploads/2017/08/one_piece_movie_z_luffy_by_exalmas-d61qk9b.png"));
    mContentYouTubes.add(new ContentYouTube("2:30", "Noi ay con tim ve", "Am nhac", 200, 3, "https://otakukart.com/wp-content/uploads/2017/08/one_piece_movie_z_luffy_by_exalmas-d61qk9b.png"));
    mContentYouTubes.add(new ContentYouTube("2:30", "Noi ay con tim ve", "Am nhac", 200, 3, "https://otakukart.com/wp-content/uploads/2017/08/one_piece_movie_z_luffy_by_exalmas-d61qk9b.png"));

    getRowsAdapter().clear();


    for (int i = 0; i < 5; i++) {
      ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new ProgramGridPresenter(getActivity(),false));
      Collections.shuffle(mContentYouTubes);
      arrayObjectAdapter.addAll(0,mContentYouTubes);
      HeaderItem headerItem = new HeaderItem("Row".concat(i+""));
      getRowsAdapter().add(new ListRow(headerItem,
          arrayObjectAdapter));
    }

  }
}
