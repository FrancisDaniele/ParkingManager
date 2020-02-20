<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal" data-whatever="@getbootstrap">Formulario</button>

<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Rellenar</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form>
                    <div class="form-group">
                        <label for="exampleInputEmail1">Email address</label>
                        <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email" required="required">
                        
                    </div>

                    <div class="form-group">
                        <label for="Password1">Password</label>
                        <input type="password" class="form-control" id="Password1" placeholder="Password" required="required">
                        <small id="password2" class="form-text text-muted">Repite la contraseña.</small>
            			<input type="password" class="form-control" id="password2" placeholder="Contraseña" required="required">
                          </div>
                    <div class="form-group">
                        <label for="nombre">Nombre</label>
                        <input type="text" class="form-control" id="nombre" placeholder="Name" required="required">
                    </div>
                    <div class="form-group">
                        <label for="apellidos">Apellido</label>
                        <input type="text" class="form-control" id="apellidos" placeholder="Surname" required="required">
                    </div>
                    <div class="form-group">
                        <label for="nieDni">DNI O NIE</label>
                        <input type="ptex" class="form-control" id="nieDni" placeholder="DNI">
                    </div>
                    <div class="form-group">
                        <label for="telefono">Telefono</label>
                        <input type="phone" class="form-control" id="telefono" placeholder="Phone Number" required="required">
                    </div>
                    <div class="form-group">
                        <label for="vehiculo1">Vehiculo 1</label>
                        <input type="text" class="form-control" id="vehiculo1" placeholder="Matricula" required="required">
                    </div>
                    <div class="form-group form-check">
                        <input type="checkbox" class="form-check-input" id="Check1" required="required">
                        <label class="form-check-label" for="Check1">Electrico</label>
                    </div>
                    <div class="form-group">
                        <label for="vehiculo2">Vehiculo 2</label>
                        <input type="text" class="form-control" id="vehiculo2" placeholder="Matricula">
                    </div>
                    <div class="form-group form-check">
                        <input type="checkbox" class="form-check-input" id="Check2">
                        <label class="form-check-label" for="Check2">Electrico</label>
                    </div>
                    <div class="form-group">
                        <label for="vehiculo31">Vehiculo 3</label>
                        <input type="text" class="form-control" id="vehiculo3" placeholder="Matricula">
                    </div>
                    <div class="form-group form-check">
                        <input type="checkbox" class="form-check-input" id="Check3">
                        <label class="form-check-label" for="Check3">Electrico</label>
                    </div>

                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary">Submit</button>
            </div>
        </div>
    </div>
</div>