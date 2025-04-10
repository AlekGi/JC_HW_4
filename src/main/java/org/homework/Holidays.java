package org.homework;

import lombok.Getter;

@Getter
public enum Holidays {
    NOT_HOLIDAY(0,0),
    NEW_YEAR(1, 1),
    EIGHT_MARCH(3,8),
    TWENTY_THREE_FEBRUARY(2,23);

    private final int day;
    private final int month;

    Holidays(int month, int day) {
        this.day = day;
        this.month = month;
    }

}
