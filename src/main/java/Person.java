public class Person implements Cloneable {
    private String name;
    private int income;
    private City city;
    public String getName() {
        return name;
    }
    public void setName(String firstName) {
        this.name = firstName;
    }
    public int getIncome() {
        return income;
    }
    public void setIncome(int income) {
        this.income = income;
    }
    public City getCity() {
        return city;
    }
    public void setCity(City city) {
        this.city = city;
    }
    public Person(String firstName, int income, City city) {
        super();
        this.name = firstName;
        this.income = income;
        this.city = city;
    }
    @Override
    public Person clone() throws CloneNotSupportedException {
        Person clonedObj = (Person) super.clone();
       //clonedObj.city = this.city.clone();
        return clonedObj;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", income=" + income + ", city=" + city + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((city == null) ? 0 : city.hashCode());
        result = prime * result + income;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (city == null) {
            if (other.city != null)
                return false;
        } else if (!city.equals(other.city))
            return false;
        if (income != other.income)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}
