package com.example.bookapplication.databinding;
import com.example.bookapplication.R;
import com.example.bookapplication.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentBookDetailBindingImpl extends FragmentBookDetailBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.image, 7);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentBookDetailBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentBookDetailBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[7]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.fragment == variableId) {
            setFragment((com.example.bookapplication.ui.detail.BookDetailFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.example.bookapplication.ui.detail.BookDetailFragment Fragment) {
        this.mFragment = Fragment;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.fragment);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String fragmentBookTitle = null;
        java.lang.String fragmentBookPriceToString = null;
        com.example.bookapplication.model.search.data.Book fragmentBook = null;
        java.lang.Integer fragmentBookPrice = null;
        com.example.bookapplication.ui.detail.BookDetailFragment fragment = mFragment;
        java.lang.String fragmentBookUrl = null;
        java.lang.String fragmentBookDatetime = null;
        java.lang.String fragmentBookContents = null;
        java.lang.String fragmentBookStatus = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (fragment != null) {
                    // read fragment.book
                    fragmentBook = fragment.getBook();
                }


                if (fragmentBook != null) {
                    // read fragment.book.title
                    fragmentBookTitle = fragmentBook.getTitle();
                    // read fragment.book.price
                    fragmentBookPrice = fragmentBook.getPrice();
                    // read fragment.book.url
                    fragmentBookUrl = fragmentBook.getUrl();
                    // read fragment.book.datetime
                    fragmentBookDatetime = fragmentBook.getDatetime();
                    // read fragment.book.contents
                    fragmentBookContents = fragmentBook.getContents();
                    // read fragment.book.status
                    fragmentBookStatus = fragmentBook.getStatus();
                }


                if (fragmentBookPrice != null) {
                    // read fragment.book.price.toString()
                    fragmentBookPriceToString = fragmentBookPrice.toString();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, fragmentBookTitle);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, fragmentBookContents);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, fragmentBookDatetime);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, fragmentBookPriceToString);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, fragmentBookStatus);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, fragmentBookUrl);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): fragment
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}