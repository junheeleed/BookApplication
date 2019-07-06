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
import com.example.bookapplication.ui.detail.BookDetailFragment;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentBookDetailBinding extends ViewDataBinding {
  @NonNull
  public final ImageView image;

  @Bindable
  protected BookDetailFragment mFragment;

  protected FragmentBookDetailBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView image) {
    super(_bindingComponent, _root, _localFieldCount);
    this.image = image;
  }

  public abstract void setFragment(@Nullable BookDetailFragment fragment);

  @Nullable
  public BookDetailFragment getFragment() {
    return mFragment;
  }

  @NonNull
  public static FragmentBookDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_book_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentBookDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentBookDetailBinding>inflateInternal(inflater, com.example.bookapplication.R.layout.fragment_book_detail, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentBookDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_book_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentBookDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentBookDetailBinding>inflateInternal(inflater, com.example.bookapplication.R.layout.fragment_book_detail, null, false, component);
  }

  public static FragmentBookDetailBinding bind(@NonNull View view) {
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
  public static FragmentBookDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentBookDetailBinding)bind(component, view, com.example.bookapplication.R.layout.fragment_book_detail);
  }
}
