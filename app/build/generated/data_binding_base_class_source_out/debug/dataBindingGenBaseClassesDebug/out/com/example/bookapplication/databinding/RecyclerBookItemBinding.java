package com.example.bookapplication.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.example.bookapplication.ui.books.ViewHolder;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RecyclerBookItemBinding extends ViewDataBinding {
  @NonNull
  public final ImageView bookImage;

  @Bindable
  protected ViewHolder mViewholder;

  protected RecyclerBookItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView bookImage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bookImage = bookImage;
  }

  public abstract void setViewholder(@Nullable ViewHolder viewholder);

  @Nullable
  public ViewHolder getViewholder() {
    return mViewholder;
  }

  @NonNull
  public static RecyclerBookItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.recycler_book_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RecyclerBookItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RecyclerBookItemBinding>inflateInternal(inflater, com.example.bookapplication.R.layout.recycler_book_item, root, attachToRoot, component);
  }

  @NonNull
  public static RecyclerBookItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.recycler_book_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RecyclerBookItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RecyclerBookItemBinding>inflateInternal(inflater, com.example.bookapplication.R.layout.recycler_book_item, null, false, component);
  }

  public static RecyclerBookItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static RecyclerBookItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (RecyclerBookItemBinding)bind(component, view, com.example.bookapplication.R.layout.recycler_book_item);
  }
}
