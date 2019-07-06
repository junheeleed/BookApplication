package com.example.bookapplication;

import android.databinding.DataBinderMapper;
import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.example.bookapplication.databinding.ActivityBookBindingImpl;
import com.example.bookapplication.databinding.ActivityBookDetailBindingImpl;
import com.example.bookapplication.databinding.FragmentBookDetailBindingImpl;
import com.example.bookapplication.databinding.FragmentBooksBindingImpl;
import com.example.bookapplication.databinding.RecyclerBookItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYBOOK = 1;

  private static final int LAYOUT_ACTIVITYBOOKDETAIL = 2;

  private static final int LAYOUT_FRAGMENTBOOKDETAIL = 3;

  private static final int LAYOUT_FRAGMENTBOOKS = 4;

  private static final int LAYOUT_RECYCLERBOOKITEM = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.bookapplication.R.layout.activity_book, LAYOUT_ACTIVITYBOOK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.bookapplication.R.layout.activity_book_detail, LAYOUT_ACTIVITYBOOKDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.bookapplication.R.layout.fragment_book_detail, LAYOUT_FRAGMENTBOOKDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.bookapplication.R.layout.fragment_books, LAYOUT_FRAGMENTBOOKS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.bookapplication.R.layout.recycler_book_item, LAYOUT_RECYCLERBOOKITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYBOOK: {
          if ("layout/activity_book_0".equals(tag)) {
            return new ActivityBookBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_book is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYBOOKDETAIL: {
          if ("layout/activity_book_detail_0".equals(tag)) {
            return new ActivityBookDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_book_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTBOOKDETAIL: {
          if ("layout/fragment_book_detail_0".equals(tag)) {
            return new FragmentBookDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_book_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTBOOKS: {
          if ("layout/fragment_books_0".equals(tag)) {
            return new FragmentBooksBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_books is invalid. Received: " + tag);
        }
        case  LAYOUT_RECYCLERBOOKITEM: {
          if ("layout/recycler_book_item_0".equals(tag)) {
            return new RecyclerBookItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for recycler_book_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new com.android.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "fragment");
      sKeys.put(2, "viewholder");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/activity_book_0", com.example.bookapplication.R.layout.activity_book);
      sKeys.put("layout/activity_book_detail_0", com.example.bookapplication.R.layout.activity_book_detail);
      sKeys.put("layout/fragment_book_detail_0", com.example.bookapplication.R.layout.fragment_book_detail);
      sKeys.put("layout/fragment_books_0", com.example.bookapplication.R.layout.fragment_books);
      sKeys.put("layout/recycler_book_item_0", com.example.bookapplication.R.layout.recycler_book_item);
    }
  }
}
