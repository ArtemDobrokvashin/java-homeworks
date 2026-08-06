```java

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        Human humanObj = (Human) obj;
        boolean result = fio.equals(humanObj.fio)
                && birthday.equals(humanObj.birthday);
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(birthday, fio);
    }
```