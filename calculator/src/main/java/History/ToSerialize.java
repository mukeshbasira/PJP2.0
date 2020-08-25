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
	public void addSession(localStructure localStructure) {

		sessionList.add(localStructure);

	}

	@Override
	public void save(String fileLocationString) throws Exception {
		if (show(fileLocationString) != null) {
			ArrayList<Structure.localStructure> readObject = show(fileLocationString);

			sessionList.addAll(readObject);
			Integer count = 1;

			for (localStructure localStructure : sessionList) {
				print(localStructure, count++);

			}

		}

		FileOutputStream outputStream = new FileOutputStream(new File(fileLocationString));
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {

			objectOutputStream.writeObject(sessionList.size());
			for (localStructure s : this.sessionList) {
				objectOutputStream.writeObject(s);
			}


		}

		System.out.println("SAVED!!!");

		outputStream.flush();

		outputStream.close();
	}

	@Override
	public ArrayList<localStructure> show(
			String fileLocationString)
					throws FileNotFoundException, IOException, Exception {
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

	private void print(localStructure localStructure, Integer count) {
		System.out.println("---------------Entry number--" + count + "-------------");
		System.out.println(" Option selected - " + localStructure.getOption());
		System.out.println("option phrase  was - " + localStructure.getOptionSelectedString());

		System.out.println("operation was - " + localStructure.getSelectedString());
		System.out.println("User First input was - " + localStructure.getUserFirstDateString());
		System.out.println("User Second input was - " + localStructure.getUserSecondDateString());
		System.out.println("Output was - " + localStructure.getResult());

	}
}
