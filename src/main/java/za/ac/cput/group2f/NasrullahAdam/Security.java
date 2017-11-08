package za.ac.cput.group2f.NasrullahAdam;

public class Security {

    private int secLevel;
    private String name;
    private int age;

    public Security(Builder builder){
        secLevel = builder.secLevel;
        name = builder.name;
        age = builder.age;
    }

    public static class Builder {
        private int secLevel;
        private String name;
        private int age;

        public Builder name(String value){
            this.name = value;
            return this;
        }

        public Builder age(int value){
            this.age = value;
            return this;
        }

        public Builder secLevel(int value){
            this.secLevel = value;
            return this;
        }

        public Security build(){
            return new Security(this);
        }
    }

    public int getSecLevel() {
        return secLevel;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Security)) return false;

        Security security = (Security) o;

        return secLevel == security.secLevel;
    }

    @Override
    public int hashCode(){
        return secLevel;
    }
}
