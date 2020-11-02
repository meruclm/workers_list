package space.merunka.workerslist.api;
import io.reactivex.rxjava3.core.Observable;
import space.merunka.workerslist.pojo.EmployeesResponse;

import retrofit2.http.GET;


public interface ApiService {

    @GET("testTask.json")
    Observable<EmployeesResponse> getEmployees();
}
