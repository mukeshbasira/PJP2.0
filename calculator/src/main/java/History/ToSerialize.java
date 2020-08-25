package History;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import Structure.localStructure;

public class ToSerialize implements History {
	ArrayList<localStructure> sessionList = new ArrayList<localStructure>();

	localStructure localStructure;

	private ArrayList<Structure.localStructure> readObject = new ArrayList<localStructure>();

	@Override
	public void save(String fileLocationString) throws Exception {
		File file = new File(fileLocationString);
		//		if (file.exists() && show(fileLocationString) != null) {
		//			ArrayList<Structure.localStructure> readObject = show(fileLocationString);
		//
		//			sessionList.addAll(readObject);
		//
		//		}

		FileOutputStream outputStream = new FileOutputStream(new File(fileLocationString), true);
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {

			objectOutputStream.writeObject(sessionList.size());
			for (localStructure s : this.sessionList) {
				objectOutputStream.writeObject(s);
			}

		}
		print(sessionList);

		System.out.println("SAVED!!!");

		outputStream.flush();

		outputStream.close();
	}

	@Override
	public ArrayList<localStructure> show(
			String fileLocationString)
					throws FileNotFoundException, IOException, Exception {
		File file = new File(fileLocationString);
		if (file.exists()) {
			FileInputStream fileInputStream = new FileInputStream(new File(fileLocationString));

			try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {



				Integer count = (Integer) objectInputStream.readObject();
				System.out.println(count);

				for (int i = 1; i <= count; i++) {


					localStructure = (Structure.localStructure) objectInputStream.readObject();

					readObject.add(localStructure);


				}

			}
			return readObject;
		}
		return null;

	}

	private void print(ArrayList<localStructure> list) {

		Integer count = 1;
		for (localStructure localStructure : list) {

			System.out.println("---------------Entry number--" + count++ + "-------------");
			System.out.println(" Option selected - " + localStructure.getOption());
			System.out.println("option phrase  was - " + localStructure.getOptionSelectedString());

			System.out.println("operation was - " + localStructure.getSelectedString());
			System.out.println("User First input was - " + localStructure.getUserFirstDateString());
			System.out.println("User Second input was - " + localStructure.getUserSecondDateString());
			System.out.println("Output was - " + localStructure.getResult());
		}

	}

	@Override
	public void addSession(ArrayList<Structure.localStructure> localStructure) {
		this.sessionList = localStructure;

	}

}
