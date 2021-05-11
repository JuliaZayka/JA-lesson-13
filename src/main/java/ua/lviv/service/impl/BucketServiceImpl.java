package ua.lviv.service.impl;

import java.util.List;

import ua.lviv.dao.BucketDao;
import ua.lviv.dao.impl.BucketDaoImpl;
import ua.lviv.Bucket;
import ua.lviv.service.BucketService;

public class BucketServiceImpl implements BucketService {
	private static BucketService bucketServiceImpl;
	private BucketDao bucketDao;

	private BucketServiceImpl() {
		
			bucketDao = new BucketDaoImpl();
		
	}

	public static BucketService getBucketService() {
		if (bucketServiceImpl == null) {
			bucketServiceImpl = new BucketServiceImpl();
		}

		return bucketServiceImpl;
	}

	@Override
	public Bucket create(Bucket t) {
		return bucketDao.create(t);
	}

	@Override
	public Bucket read(Integer id) {
		return bucketDao.read(id);
	}

	@Override
	public Bucket update(Bucket t) {
		return bucketDao.update(t);
	}

	@Override
	public void delete(Integer id) {
		bucketDao.delete(id);
	}

	@Override
	public List<Bucket> readAll() {
		return bucketDao.readAll();
	}

}