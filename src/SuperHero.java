public class SuperHero extends Identity {

        private String alterEgo;

        public SuperHero(String name, String alterEgo) {
            super(name);
            this.alterEgo = alterEgo;
        }
        public String getName() {
            return alterEgo;
        }
        public String getSecretIdentity() {
            return super.getName();
        }

    public static void main(String[] args) {
        SuperHero theManOfSteel = new SuperHero("Bruce Banner", "Hulk");

        System.out.println(theManOfSteel.getName());
        System.out.println(theManOfSteel.getSecretIdentity());
    }

}
