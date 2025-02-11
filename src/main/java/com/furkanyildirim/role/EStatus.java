package com.furkanyildirim.role;

public enum EStatus {
    BEKLEMEDE("Beklemede"),
    TAMAMLANDI("Tamamlandı"),
    IPTAL_EDILDI("İptal Edildi");

    private final String label;

    EStatus(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
