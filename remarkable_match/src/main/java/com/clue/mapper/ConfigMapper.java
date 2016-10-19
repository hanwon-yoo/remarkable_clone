package com.clue.mapper;

public class ConfigMapper {
    public String getDatabases(String db) {
        return String.format(
                "SELECT * FROM `%s`.`release` WHERE `type`='database' order by no LIMIT 1",
                db
        );
    }

    public String getGlobalVariable(String db) {
        return String.format(
                "SELECT * FROM `%s`.`release` WHERE `type`='globalVariable' order by no LIMIT 1",
                db
        );
    }
}
