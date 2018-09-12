public class TypeTag {
    public int tag;
    public int[] gender = new int[2];

    public TypeTag(int i) {
        this.tag = i;
    }

    public void addGender(int i) {
        if (i == 1) {
            gender[0]++;
        } else if (i == 2) {
            gender[1]++;
        }
    }

    public int[] getGender() {
        return gender;
    }

    public int getTag() {
        return tag;
    }
}