package ensure;

import java.util.ArrayList;

/**
 * Zoo
 * Zoo merupakan class yang merepresentasikan sebuah kebun binatang
 * Created by Girvandi on 3/27/2017.
 */
public class Zoo {
	private static int maxCell = 40;
	public static Zoo zoo = new Zoo(maxCell);
	private ArrayList<Animal> animal_ = new ArrayList<Animal>();
	private ArrayList<ArrayList<Cell>> cell_;

	/**
	 * Constructor.
	 * Melakukan inisialisasi kelas
	 */
	public Zoo() {
		cell_ = new ArrayList<ArrayList<Cell>>(maxCell);
		for (int i = 0; i < maxCell; i++) {
			cell_.add(new ArrayList<Cell>());
		}
		for (int i = 0; i < maxCell; i++) {
			for (int j = 0; j < maxCell; j++) {
				if (i == maxCell - 1 || j == maxCell - 1) {
					cell_.get(i).add(j, new Cell(i, j, "Road", null, -1, "RoadExit", '_'));
				} else {
					cell_.get(i).add(j, new Cell(i, j, "Road", null, -1, "Road", ' '));
				}
			}
		}
	}

	/**
	 * Constructor(int).
	 * Melakukan inisialisasi kelas dengan memasukkan konstanta integer n
	 */
	public Zoo(int n) {
		maxCell = n;
		cell_ = new ArrayList<ArrayList<Cell>>(maxCell);
		for (int i = 0; i < maxCell; i++) {
			cell_.add(new ArrayList<Cell>());
		}
		for (int i = 0; i < maxCell; i++) {
			for (int j = 0; j < maxCell; j++) {
				if (i == maxCell - 1 || j == maxCell - 1) {
					cell_.get(i).add(j, new Cell(i, j, "Road", null, -1, "RoadExit", '_'));
				} else {
					cell_.get(i).add(j, new Cell(i, j, "Road", null, -1, "Road", ' '));
				}
			}
		}
	}

	/**
	 * get
	 * Mengembalikan Zoo class
	 */
	public static Zoo Get(int n) {
		return zoo;
	}

	/**
	 * getMaxCell
	 * Mengembalikan max cell
	 */
	public static int getMaxCell() {
		return maxCell;
	}

	/**
	 * getCell
	 * Mengembalikan pointer cell di dalam arrayList cell_
	 */
	public Cell getCell(int x, int y) {
		return cell_.get(x).get(y);
	}

	/**
	 * setCell
	 * Menginisialisasi animal dan turunannya pada suatu cell
	 */
	public void setCell(int x, int y, Cell c) {
		cell_.get(y).set(x, c);
	}

	/**
	 * setMaxCell
	 * Menginisialisasi animal dan turunannya pada suatu cell
	 */
	public void setMaxCell(int n) {
		maxCell = n;
	}

	/**
	 * getAllCell
	 * Mengembalikan pointer semua cell di dalam vektor of vektor cell_
	 */
	public ArrayList<ArrayList<Cell>> getAllCell() {
		return cell_;
	}

	/**
	 * SetAnimal
	 * Berfungsi untuk meletakan animal
	 * Asumsi bahwa animal sudah terdefinisi
	 *
	 * @param a memberikan value animal yang ingin dimasukan
	 */
	public void SetAnimal(Animal a) {
		cell_.get(a.getLocX()).get(a.getLocY()).setAnimalPtr(a);
		animal_.add(a);
	}

	/**
	 * GetAnimal
	 * Berfungsi untuk mengambil animal
	 * Asumsi bahwa vector animal sudah terdefinisi
	 *
	 * @param x posisi x
	 * @param y posisi y
	 * @return Pointer to Animal
	 */
	public Animal GetAnimal(int x, int y) {
		if (cell_.get(x).get(y).getAnimal() != null) {
			return cell_.get(x).get(y).getAnimal();
		} else {
			return null;
		}
	}

  /* METODE LAIN */

	/**
	 * update
	 * Metode untuk update status posisi dari tiap animal
	 */
	public void update() {
		for (int i = 0; i < animal_.size(); i++) {
			int temp_x = animal_.get(i).getLocX();
			int temp_y = animal_.get(i).getLocY();
			boolean up = false;
			boolean down = false;
			boolean right = false;
			boolean left = false;

			if (temp_y > 0) {
				up = (cell_.get(temp_x).get(temp_y - 1).getAnimal() == null) &&
						(cell_.get(temp_x).get(temp_y - 1).getCageId() == cell_.get(temp_x).get(temp_y).getCageId()) &&
						(cell_.get(temp_x).get(temp_y - 1).getCellType().equals(cell_.get(temp_x).get(temp_y).getCellType()));
			}
			if (temp_y < maxCell - 1) {
				down = (cell_.get(temp_x).get(temp_y + 1).getAnimal() == null) &&
						(cell_.get(temp_x).get(temp_y + 1).getCageId() == cell_.get(temp_x).get(temp_y).getCageId()) &&
						(cell_.get(temp_x).get(temp_y + 1).getCellType().equals(cell_.get(temp_x).get(temp_y).getCellType()));
			}
			if (temp_x > 0) {
				left = (cell_.get(temp_x - 1).get(temp_y).getAnimal() == null) &&
						(cell_.get(temp_x - 1).get(temp_y).getCageId() == cell_.get(temp_x).get(temp_y).getCageId()) &&
						(cell_.get(temp_x - 1).get(temp_y).getCellType().equals(cell_.get(temp_x).get(temp_y).getCellType()));
			}
			if (temp_x < maxCell - 1) {
				right = (cell_.get(temp_x + 1).get(temp_y).getAnimal() == null) &&
						(cell_.get(temp_x + 1).get(temp_y).getCageId() == cell_.get(temp_x).get(temp_y).getCageId()) &&
						(cell_.get(temp_x + 1).get(temp_y).getCellType().equals(cell_.get(temp_x).get(temp_y).getCellType()));
			}

			int movement = animal_.get(i).move(up, down, right, left);
			//Swap binatang
			switch (movement) {
				case 0: {
					cell_.get(temp_x).get(temp_y - 1).setAnimalPtr(animal_.get(i));
					animal_.get(i).setLocY(animal_.get(i).getLocY() - 1);
					cell_.get(temp_x).get(temp_y).setAnimalPtr(null);
					break;
				}
				case 1: {
					cell_.get(temp_x).get(temp_y + 1).setAnimalPtr(animal_.get(i));
					animal_.get(i).setLocY(animal_.get(i).getLocY() + 1);
					cell_.get(temp_x).get(temp_y).setAnimalPtr(null);
					break;
				}
				case 2: {
					cell_.get(temp_x + 1).get(temp_y).setAnimalPtr(animal_.get(i));
					animal_.get(i).setLocX(animal_.get(i).getLocX() + 1);
					cell_.get(temp_x).get(temp_y).setAnimalPtr(null);
					break;
				}
				case 3: {
					cell_.get(temp_x - 1).get(temp_y).setAnimalPtr(animal_.get(i));
					animal_.get(i).setLocX(animal_.get(i).getLocX() - 1);
					cell_.get(temp_x).get(temp_y).setAnimalPtr(null);
					break;
				}
				default:
					break;
			}
		}
	}

	/**
	 * Tour
	 * Metode untuk melakukan tour dari posisi i dan j
	 *
	 * @param en_x adalah entrence x
	 * @param en_y adalah entrence y
	 */
	public void tour(int en_x, int en_y) {
		int current_x = en_x;
		int current_y = en_y;

		boolean[][] visited = new boolean[maxCell][maxCell];
		for (int i = 0; i < maxCell; i++) {
			for (int j = 0; j < maxCell; j++) {
				visited[i][j] = false;
			}
		}
		while (!cell_.get(current_x).get(current_y).getName().equals("RoadExit")) {
			visited[current_x][current_y] = true;
			Boolean[] side = new Boolean[4];
			for(int i = 0; i < 4; i++) {
				side[i] = false;
			}
			if(current_y < maxCell - 1) {
				System.out.println("Bawah : " + cell_.get(current_x).get(current_y + 1).getName());
				side[0] =  cell_.get(current_x).get(current_y + 1).getName().equals("Road") && !visited[current_x][current_y + 1];
			}

			if(current_x < maxCell - 1) {
				System.out.println("Kanan : " + cell_.get(current_x+1).get(current_y).getName());
				side[1] = cell_.get(current_x + 1).get(current_y).getName().equals("Road") && !visited[current_x + 1][current_y];
			}

			if(current_y > 0) {
				System.out.println("Atas : " + cell_.get(current_x).get(current_y - 1).getName());
				side[2] = cell_.get(current_x).get(current_y - 1).getName().equals("Road") && !visited[current_x][current_y - 1];
			}

			if(current_x > 0) {
				System.out.println("Kiri : " + cell_.get(current_x-1).get(current_y).getName());
				side[3] = cell_.get(current_x - 1).get(current_y).getName().equals("Road") && !visited[current_x - 1][current_y];
			}

			for(int i = 0; i < 4; i++) {
				System.out.print(side[i] + " ");
			}
			System.out.println();
			if (side[0]) { //bawah
				current_y++;
			} else if (side[1] ) { //kanan
				current_x++;
			} else if (side[2]) { //atas
				current_y--;
			} else if (side[3] ) { //kiri
				current_x--;
			} else {
				break;
			}

			System.out.println(current_x   + " " + current_y + " " + cell_.get(current_x).get(current_y).getName());
			for (int i = 0; i < maxCell; i++) {
				for (int j = 0; j < maxCell; j++) {
					if (i == current_x && j == current_y) {
						System.out.print('@');
					} else {
						if (cell_.get(i).get(j).getAnimal() != null) {
							System.out.print(cell_.get(i).get(j).getAnimal().getSymbol());
						} else {
							System.out.print(cell_.get(i).get(j).getSymbol());
						}
					}
				}
				System.out.println();
			}
			System.out.println();
			//clearWait(1);
		}
		//last print
		for (int i = 0; i < maxCell; i++) {
			for (int j = 0; j < maxCell; j++) {
				if (i == current_x && j == current_y) {
					System.out.print('@');
				} else {
					if (cell_.get(i).get(j).getAnimal() instanceof Animal) {
						System.out.print(cell_.get(i).get(j).getAnimal().getSymbol());
					} else {
						System.out.print(cell_.get(i).get(j).getSymbol());
					}
				}
			}
			System.out.println();
		}
		System.out.print("Tour Finished!");
	}

	/**
	 * @brief TotalFood
	 * Metode untuk mengambil total makanan dari semua binatang
	 */
	public void TotalFood() throws InterruptedException {
		float meat = 0;
		float grass = 0;
		for(int i = 0; i < animal_.size(); i++){
			if(animal_.get(i).getFoodType().equals("Carnivore")) {
				meat+=animal_.get(i).getTotalFood();
			} else if(animal_.get(i).getFoodType().equals("Herbivore")) {
				grass+=animal_.get(i).getTotalFood();
			} else if(animal_.get(i).getFoodType().equals("Omnivore")) {
				meat+= 0.5 * animal_.get(i).getTotalFood();
				grass+= 0.5 * animal_.get(i).getTotalFood();
			}
			System.out.println(animal_.get(i).getName() + " eats " + animal_.get(i).getTotalFood() + " kg");
			System.out.println("Total meat for Carnivores and Omnivores = " + meat + " kg");
			System.out.println("Total grass for Herbivores and Omnivores = " + grass + " kg");
			Utility.clearWait(1);
		}
	}

	/**
	 * @brief toString
	 * Metode untuk menampilkan isi zoo ke layar
	 */
	public String toString() {
		String temp_str = new String();
		for (int i = 0; i < maxCell; i++) {
			for (Cell temp : cell_.get(i)) {
				if (temp.getAnimal() != null) {
					temp_str += (temp.getAnimal().getSymbol() + " ");
				} else {
					temp_str += (temp.getSymbol() + " ");
				}
			}
			temp_str += "\n";
		}
		return temp_str;
	}
}



