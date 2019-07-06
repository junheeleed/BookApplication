package com.example.bookapplication.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityBookBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout framelayout;

  protected ActivityBookBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FrameLayout framelayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.framelayout = framelayout;
  }

  @NonNull
  public static ActivityBookBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_book, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityBookBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityBookBinding>inflateInternal(inflater, com.example.bookapplication.R.layout.activity_book, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityBookBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_book, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityBookBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityBookBinding>inflateInternal(inflater, com.example.bookapplication.R.layout.activity_book, null, false, component);
  }

  public static ActivityBookBinding bind(@NonNull View view) {
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
  public static ActivityBookBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityBookBinding)bind(component, view, com.example.bookapplication.R.layout.activity_book);
  }
}
