package com.company.abstractClasses.emailManagementSystem;

public class emailDemo {
    public static void main(String[] args) {
        Address angelo = new IndividualAddress("angelo");
        Address emilia = new IndividualAddress("emilia");
        GroupAddress siblings = new GroupAddress("siblings");
        GroupAddress parents = new GroupAddress("parents");
        GroupAddress family = new GroupAddress("family");
        siblings.addAddress(angelo);
        siblings.addAddress(emilia);
        Address mum = new IndividualAddress("mum");
        Address dad = new IndividualAddress("mum");
        parents.addAddress(mum);
        parents.addAddress(dad);
        family.addAddress(parents);
        family.addAddress(siblings);

        assert siblings.getTargets().size() == 2;
        assert parents.getTargets().size() == 2;
        assert family.getTargets().size() == 4;
        assert angelo.equals(new IndividualAddress("angelo"));
    }
}
