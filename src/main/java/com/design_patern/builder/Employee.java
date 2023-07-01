package com.design_patern.builder;

public class Employee {
    private String name;
    private String email;
    private String address;
    private int salary;
    private String skill;

    public Employee(Builder b) {
        this.name = b.name;
        this.email = b.email;
        this.address = b.address;
        this.salary = b.salary;
        this.skill = b.skill;
    }

    public static Builder createBuilder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public int getSalary() {
        return salary;
    }

    public String getSkill() {
        return skill;
    }

    public static class Builder {
        private String name;
        private String email;
        private String address;
        private int salary;
        private String skill;

        public Builder setName(String name) {
            this.name = name;

            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setSalary(int salary) {
            this.salary = salary;
            return this;
        }

        public Builder setSkill(String skill) {
            this.skill = skill;
            return this;
        }

        boolean validate() {
            if(salary > 20000 && skill.equalsIgnoreCase("java")) {
                return true;
            }

            return false;
        }

        public Employee build() {
            if(!validate()) throw new IllegalArgumentException("paramters are not correct");

            return new Employee(this);
        }
    }
}
