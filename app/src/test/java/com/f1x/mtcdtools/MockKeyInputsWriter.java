package com.f1x.mtcdtools;

import com.f1x.mtcdtools.keys.storage.KeyInputsWriterInterface;

import java.io.IOException;

/**
 * Created by COMPUTER on 2016-08-01.
 */
class MockKeyInputsWriter implements KeyInputsWriterInterface {
    public MockKeyInputsWriter() {
        mOutput = "";
    }

    @Override
    public void write(String output) throws IOException {
        mOutput = output;
    }

    public String getOutput() {
        return mOutput;
    }

    private String mOutput;
}
