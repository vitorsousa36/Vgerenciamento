@extends('adminlte::page')
@section('title', 'VGerenciamento - Home')

@section('content')
    <div class="container">
        <div class="row">
            <div class="col-xs-12 col-md-10 well">
                nome  :  <?php echo $Categorias->nome ?>
            </div>
        </div>
    </div>
@endsection

