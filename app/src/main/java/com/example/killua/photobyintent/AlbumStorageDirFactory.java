package com.example.killua.photobyintent;

/**
 * Created by killua on 4/11/15.
 */
import java.io.File;

abstract class AlbumStorageDirFactory {
    public abstract File getAlbumStorageDir(String albumName);
}
