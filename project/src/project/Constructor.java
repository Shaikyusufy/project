package project;

public class Constructor {
	
		private String name;
		private int age;
		private String city;
		Constructor(String name, int age, String city) {
			// TODO Auto-generated constructor stub
			 this.name=name;
			 this.age=age;
			 this.city=city;
		}
		public String getName() {
			return name;
		}


		public int getAge() {
			return age;

		}
		public String getCity() {
			return city;
		}
		}


		class launch {
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Constructor n=new Constructor("Ravi",23,"Banglore");
		System.out.println(n.getAge());
		System.out.println(n.getName());
		System.out.println(n.getCity());
			}
		}

}
