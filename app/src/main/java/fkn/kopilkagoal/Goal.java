package fkn.kopilkagoal;

import java.util.Date;

/**
 * Created by 633IsPerfect on 30.11.2016.
 */

public class Goal {
    private Integer id;
    private String name,description;
    private Integer money;

    public Goal(Integer id, String name, Integer money, String description) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
