class Badge {
    public String print(Integer id, String name, String department) {
        if(id!=null&&name!=null&&department!=null){
            return (String) "["+id+"]"+" - "+name+" - "+ department.toUpperCase();
        }
        if(name!=null&&department!=null){
            return (String) name+" - "+ department.toUpperCase();
        }
        if(id!=null&&department==null){
            return (String) "["+id+"]"+" - "+name+" - OWNER";
        }
        else {return (String) name+" - OWNER";}
    }
}
