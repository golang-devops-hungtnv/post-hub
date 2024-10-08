package org.example.domain.common;


import java.util.Map;
import lombok.Getter;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Getter
public enum StorageContentType {
    PDF("application/pdf"),
    RAR("application/vnd.rar"),
    ZIP("application/zip"),
    COMPRESSED_ZIP("application/x-zip-compressed"),
    JPEG("image/jpeg"),
    PNG("image/png"),
    CSV("text/csv"),
    EXCEL_XLS("application/vnd.ms-excel"),
    EXCEL("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"),
    WORD_DOC("application/msword"),
    WORD("application/vnd.openxmlformats-officedocument.wordprocessingml.document"),
    PPT("application/vnd.ms-powerpoint"),
    PPTX("application/vnd.openxmlformats-officedocument.presentationml.presentation");

    private final String contentType;

    private static final Map<StorageContentType, String> EXTENSION_MAP =
            Map.of(
                    PDF, ".pdf",
                    RAR, ".rar",
                    ZIP, ".zip",
                    COMPRESSED_ZIP, ".zip",
                    JPEG, ".jpeg",
                    PNG, ".png",
                    CSV, ".csv",
                    EXCEL, ".xlsx",
                    WORD, ".doc",
                    PPT, ".ppt");

    public static StorageContentType fromString(String contentType) {
        for (StorageContentType storageContentType : StorageContentType.values()) {
            if (storageContentType.getContentType().equals(contentType)) {
                return storageContentType;
            }
        }
        return null;
    }
}