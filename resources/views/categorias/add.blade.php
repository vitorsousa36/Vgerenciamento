@extends('adminlte::page')
@section('title', 'VGerenciamento - Home')

@section('content')

    @if ($errors->any())
        <div class="alert alert-danger">
            <ul>
                @foreach ($errors->all() as $error)
                    <li>{{ $error }}</li>
                @endforeach
            </ul>
        </div>
    @endif

    <form role="form" method="post" action="/categorias" >
    <div class="box ">

        <div class="box-header">
            <h2>Adicionar Categoria</h2>
        </div>
        <div class="box-body">
            <input type="hidden" name="_token" value="{{ csrf_token() }}">
            <div class="form-group">
                <label for="nome">Nome:</label>
                <input type="text" class="form-control" id="nome" name="nome">
            </div>
        </div>
        <div class="box-footer">
            <button type="submit" class="btn btn-primary">Confirmar</button>
        </div>

    </div>
    </form>
@endsection
