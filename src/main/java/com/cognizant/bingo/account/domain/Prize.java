package com.cognizant.bingo.account.domain;

//@Entity
public class Prize {
    //    @Id
//    @GeneratedValue
//    private Long id;
    private String prize;

    public Prize() {
    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public Prize(String prize) {
        this.prize = prize;
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

    @Override
    public String toString() {
        return "Prize{" +
//                "id=" + id +
                ", prize='" + prize + '\'' +
                '}';
    }
}
