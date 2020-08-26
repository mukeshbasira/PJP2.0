package com.app.History;

import java.util.ArrayList;

import com.app.Structure.localStructure;

public class showSession {
	ArrayList<localStructure> sessionList = new ArrayList<localStructure>();

	localStructure localStructure;


	//	@Override
	//	public void save(String fileLocationString) throws Exception {
	//		File file = new File(fileLocationString);
	//		//		if (file.exists() && show(fileLocationString) != null) {
	//		//			ArrayList<Structure.localStructure> readObject = show(fileLocationString);
	//		//
	//		//			sessionList.addAll(readObject);
	//		//
	//		//		}
	//
	//		FileOutputStream outputStream = new FileOutputStream(new File(fileLocationString), true);
	//		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
	//
	//			objectOutputStream.writeObject(sessionList.size());
	//			for (localStructure s : this.sessionList) {
	//				objectOutputStream.writeObject(s);
	//			}
	//
	//		}
	//		print(sessionList);
	//
	//		System.out.println("SAVED!!!");
	//
	//		outputStream.flush();
	//
	//		outputStream.close();
	//	}
	//
	//	@Override
	//	public ArrayList<localStructure> show(
	//			String fileLocationString)
	//					throws FileNotFoundException, IOException, Exception {
	//		File file = new File(fileLocationString);
	//		if (file.exists()) {
	//			FileInputStream fileInputStream = new FileInputStream(new File(fileLocationString));
	//
	//			try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
	//
	//
	//
	//				Integer count = (Integer) objectInputStream.readObject();
	//				System.out.println(count);
	//
	//				for (int i = 1; i <= count; i++) {
	//
	//
	//					localStructure = (Structure.localStructure) objectInputStream.readObject();
	//
	//					readObject.add(localStructure);
	//
	//
	//				}
	//
	//			}
	//			return readObject;
	//		}
	//		return null;
	//
	//	}

	public void print(ArrayList<localStructure> list) {

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


	public void addSession(ArrayList<com.app.Structure.localStructure> localStructure) {
		this.sessionList = localStructure;

	}

}
