package de.telran.HomeWork2.Exercise3;

public class Pet extends Animal{
    private String breed;
    private String nickname;

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "breed='" + breed + '\'' +
                ", nickname='" + nickname + '\'' +
                "} " + super.toString();
    }
}
