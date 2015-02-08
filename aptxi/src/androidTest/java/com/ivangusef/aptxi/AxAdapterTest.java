package com.ivangusef.aptxi;

import junit.framework.Assert;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.test.ActivityUnitTestCase;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

/**
 * May the Force be with you, always.
 * Created on 29.01.2015.
 */
public class AxAdapterTest extends ActivityUnitTestCase<TestActivity> {

    public AxAdapterTest() {
        super(TestActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();

        startActivity(new Intent(getInstrumentation().getTargetContext(), TestActivity.class), null, null);
    }

    public void testAxAdapter() throws Exception {

        final TestModel modelToPost = new TestModel("Ivan", "Gusev", 24);
        final TestModel modelFromGet = new TestModel();

        final View view = LayoutInflater.from(getActivity()).inflate(R.layout.view_test_model, null);

        final AxTestModelAdapter adapter = new AxTestModelAdapter();
        adapter.post(modelToPost, view);
        adapter.get(modelFromGet, view);

        Assert.assertEquals(modelToPost, modelFromGet);
    }

    static class AxTestModelAdapter implements AxAdapter<TestModel> {

        @Override
        public void post(@Nullable final TestModel testModel, @NonNull View view) {
            if (testModel == null) {
                ((TextView) view.findViewById(R.id.prop12_text)).setText("Unknown/Unknown");
                ((TextView) view.findViewById(R.id.prop3_text)).setText(String.valueOf("0y"));
            } else {
                ((TextView) view.findViewById(R.id.prop12_text)).setText(testModel.mProp1 + "/" + testModel.mProp2);
                ((TextView) view.findViewById(R.id.prop3_text)).setText(testModel.mProp3 + "y");
            }
        }

        @Nullable
        @Override
        public TestModel get(@Nullable TestModel testModel, @NonNull final View view) {
            final TestModel result;
            if (testModel == null) {
                testModel = new TestModel();
                result = testModel;
            } else {
                result = null;
            }

            final String[] prop12Texts = ((TextView) view.findViewById(R.id.prop12_text)).getText().toString().split("/");
            final String prop3Text = ((TextView) view.findViewById(R.id.prop3_text)).getText().toString().split("y")[0];
            testModel.mProp1 = prop12Texts[0];
            testModel.mProp2 = prop12Texts[1];
            testModel.mProp3 = Integer.valueOf(prop3Text);

            return result;
        }
    }

    static class TestModel {

        String mProp1;
        String mProp2;
        int    mProp3;

        TestModel() {}

        TestModel(final String prop1, final String prop2, final int prop3) {
            mProp1 = prop1;
            mProp2 = prop2;
            mProp3 = prop3;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            final TestModel testModel = (TestModel) o;

            if (mProp3 != testModel.mProp3) {
                return false;
            }
            if (!mProp1.equals(testModel.mProp1)) {
                return false;
            }
            if (!mProp2.equals(testModel.mProp2)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = mProp1.hashCode();
            result = 31 * result + mProp2.hashCode();
            result = 31 * result + mProp3;
            return result;
        }
    }
}
