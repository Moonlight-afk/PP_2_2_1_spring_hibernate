package hiber.service;

import hiber.dao.CarDao;
import hiber.model.Car;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private final CarDao CarDao;

    public CarServiceImp(CarDao CarDao) {
        this.CarDao = CarDao;
    }

    @Transactional
    @Override
    public void add(Car car) {
        CarDao.add(car);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Car> listCars() {
        return CarDao.listCars();
    }

    @Transactional
    @Override
    public void deleteAllCars(){
        CarDao.deleteAllCars();
    }

}