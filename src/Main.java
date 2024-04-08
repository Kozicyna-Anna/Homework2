public class Main {
    public static void main(String[] args) {

      var dog = 8.0;
      System.out.println(dog);
      var cat = 3.6;
      System.out.println(cat);
      var paper = 763789;
      System.out.println(paper);

      dog = dog + 4;
      System.out.println(dog);
      cat = cat + 4;
      System.out.println(cat);
      paper = paper + 4;
      System.out.println(paper);

      dog = dog - 3.5;
      System.out.println(dog);
      cat = cat - 1.6;
      System.out.println(cat);
      paper = paper - 7639;
      System.out.println(paper);

      var friend = 19;
      System.out.println(friend);
      friend = friend + 2;
      System.out.println(friend);
      friend = friend / 7;
      System.out.println(friend);

      var frog = 3.5;
      System.out.println(frog);
      frog = frog * 10;
      System.out.println(frog);
      frog = frog / 3.5;
      System.out.println(frog);
      frog = frog + 4;
      System.out.println(frog);

      var boxerWeight1 = 78.2;
      var boxerWeight2 = 82.7;
      var generalWeight = boxerWeight1 + boxerWeight2;
      System.out.println("Масса двух бойцов " + generalWeight + " кг!");
      var boxerMass = boxerWeight2 - boxerWeight1;
      System.out.println("Разница между массой бойцов " + boxerMass + " кг!" );

      var overload = (boxerWeight2 + boxerWeight1) % boxerMass;
      System.out.println("Между двумя весами " + overload + " кг!");

      var totalHours = 640;
      var employeeWorking = 8;
      var totalEmployees = totalHours / employeeWorking;
      System.out.println("Всего работников в компании - " + totalEmployees + " человек");

      var employeesWorking = 94;
      var manWorking = totalEmployees + employeesWorking;
      var openingHours = employeeWorking * manWorking;
      System.out.println("Если в компании работает " + manWorking + " человека, то всего " + openingHours + " часов работы может быть поделено между сотрудниками");


    }
}