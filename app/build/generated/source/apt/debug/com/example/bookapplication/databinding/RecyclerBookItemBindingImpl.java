package com.example.bookapplication.databinding;
import com.example.bookapplication.R;
import com.example.bookapplication.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RecyclerBookItemBindingImpl extends RecyclerBookItemBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.book_image, 4);
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
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RecyclerBookItemBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private RecyclerBookItemBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[4]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
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
        if (BR.viewholder == variableId) {
            setViewholder((com.example.bookapplication.ui.books.ViewHolder) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewholder(@Nullable com.example.bookapplication.ui.books.ViewHolder Viewholder) {
        this.mViewholder = Viewholder;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewholder);
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
        java.lang.Integer viewholderBookPrice = null;
        com.example.bookapplication.model.search.data.Book viewholderBook = null;
        com.example.bookapplication.ui.books.ViewHolder viewholder = mViewholder;
        java.lang.String viewholderBookTitle = null;
        java.lang.String viewholderBookStatus = null;
        java.lang.String viewholderBookPriceToString = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewholder != null) {
                    // read viewholder.book
                    viewholderBook = viewholder.getBook();
                }


                if (viewholderBook != null) {
                    // read viewholder.book.price
                    viewholderBookPrice = viewholderBook.getPrice();
                    // read viewholder.book.title
                    viewholderBookTitle = viewholderBook.getTitle();
                    // read viewholder.book.status
                    viewholderBookStatus = viewholderBook.getStatus();
                }


                if (viewholderBookPrice != null) {
                    // read viewholder.book.price.toString()
                    viewholderBookPriceToString = viewholderBookPrice.toString();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewholderBookTitle);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewholderBookPriceToString);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewholderBookStatus);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewholder
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}