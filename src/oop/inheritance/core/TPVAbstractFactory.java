package oop.inheritance.core;

import oop.inheritance.data.SupportedTerminal;

public abstract class TPVAbstractFactory {

    public abstract TPVDisplay getDisplay();

    public abstract TPVKeyboard getKeyboard();

    public abstract TPVPrinter getPrinter();

    public abstract TPVCardSwipper getCardSwipper();

    public abstract TPVChipReader getChipReader();

    public abstract TPVEthernet getEthernet();

    public abstract TPVModem getModem();

    public static TPVAbstractFactory getFactory(SupportedTerminal supportedTerminal){
        return switch (supportedTerminal) {
            case INGENICO -> new IngenicoFactory();
            case VERIFONE240 -> new Verifone240Factory();
            case VERIFONE520 -> new Verifone520Factory();
            case VERIFONE690 -> new Verifone690Factory();
        };
    }

}
