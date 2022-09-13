package scorex.bcjs;

import org.bouncycastle.crypto.digests.Blake2bDigest;

public class Crypto implements Exported {
    @Override
    public Blake2bDigest createBlake2bDigest(int size) {
        return new Blake2bDigest(size);
    }
}
