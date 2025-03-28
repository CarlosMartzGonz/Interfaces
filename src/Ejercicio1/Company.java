package Ejercicio1;

import java.util.*;
import java.util.stream.Collectors;

public class Company {
    private String cif;
    private String companyName;
    private Map<String,Worker> workerMap = new HashMap<>();

    public Company(String cif, String companyName) {
        this.cif = cif;
        this.companyName = companyName;
    }

    public Worker addWorker(Worker worker){
        return workerMap.put(worker.getId(),worker);
    }

    public Optional<Worker> getWorkerByID(String id){
        if(workerMap.containsKey(id))
        return Optional.of(workerMap.get(id));
        else return Optional.empty();
    }

    public List<Worker> getWorkerList(){
        List<Worker> workerList = workerMap.values().stream().toList();
        return workerList;
    }

    public Worker updateTypeWorker(String id,TypeWorker newTypeWorker) {
        if (workerMap.containsKey(id)){
            workerMap.get(id).setTypeWorker(newTypeWorker);
        return workerMap.get(id);
    }
        else
            return null;
    }

    public Worker deleteWorker(String id){
        return workerMap.remove(id);
    }

    public Worker getOlderWorker(){
        Optional<Worker> olderWorker =  workerMap.
                values().
                stream().
                min(Comparator.comparing(Worker::getStartDay));
        return olderWorker.orElse(null);
    }

    public  List<Worker> getWorkerBySpecialist(TypeWorker WorkerSpecialist){
        List<Worker> workerList =  workerMap.values().stream().
                filter(worker -> Worker.getTypeWorker().equals(WorkerSpecialist))
                .collect(Collectors.toList());
        return workerList;
    }

    public double getTotalSalary(){
        double totalSalary = workerMap.values().stream().mapToDouble(Employed::getSalary).sum();
        return totalSalary;
    }
}

