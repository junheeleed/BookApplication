package com.example.bookapplication.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Spinner;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentBooksBinding extends ViewDataBinding {
  @NonNull
  public final ProgressBar bookProgressbar;

  @NonNull
  public final RecyclerView recyclerview;

  @NonNull
  public final Spinner searchTypeSpinner;

  @NonNull
  public final SearchView searchView;

  protected FragmentBooksBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ProgressBar bookProgressbar, RecyclerView recyclerview, Spinner searchTypeSpinner,
      SearchView searchView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bookProgressbar = bookProgressbar;
    this.recyclerview = recyclerview;
    this.searchTypeSpinner = searchTypeSpinner;
    this.searchView = searchView;
  }

  @NonNull
  public static FragmentBooksBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_books, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentBooksBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentBooksBinding>inflateInternal(inflater, com.example.bookapplication.R.layout.fragment_books, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentBooksBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_books, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentBooksBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentBooksBinding>inflateInternal(inflater, com.example.bookapplication.R.layout.fragment_books, null, false, component);
  }

  public static FragmentBooksBinding bind(@NonNull View view) {
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
  public static FragmentBooksBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentBooksBinding)bind(component, view, com.example.bookapplication.R.layout.fragment_books);
  }
}
