package src.main.java.br.com.alura.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import src.main.java.br.com.alura.dto.CourseIdDto;
import src.main.java.br.com.alura.dto.PageCourseIdDto;
import src.main.java.br.com.alura.model.Course;

@RestController
@RequestMapping("/Courses")
public class CoursesController {
	
	@Autowired
	private src.main.java.br.com.alura.repository.CourseRepository CourseRepository;
	
	@GetMapping
	@Cacheable(value = "listaDeCourses")
	public Page<CourseIdDto> lista(@RequestParam(required = false) String nomeCurso,
								   @PageableDefault(sort = "dataCriacao", direction = Direction.DESC, page = 0, size = 10) Pageable paginacao) {
		
		if (nomeCurso == null) {
			PageCourseIdDto pageCourseIdDto  = new PageCourseIdDto();
			Page<Course> Courses = CourseRepository.findAll(paginacao);
			pageCourseIdDto.setCourses(Courses);
			return CourseIdDto.converter(Courses);
		} else {
			Page<Course> Courses = CourseRepository.findByCourseName(nomeCurso, paginacao);
			return CourseIdDto.converter(Courses);
		}
	}
	
//	@PostMapping
//	@Transactional
//	@CacheEvict(value = "listaDeCourses", allEntries = true)
//	public ResponseEntity<CourseIdDto> cadastrar(@RequestBody @Valid CourseForm form, UriComponentsBuilder uriBuilder) {
//		Course Course = form.converter(cursoRepository);
//		CourseRepository.save(Course);
//
//		URI uri = uriBuilder.path("/Courses/{id}").buildAndExpand(Course.getId()).toUri();
//		return ResponseEntity.created(uri).body(new CourseIdDto(Course));
//	}
	
//	@GetMapping("/{id}")
//	public ResponseEntity<DetalhesDoCourseIdDto> detalhar(@PathVariable Long id) {
//		Optional<Course> Course = CourseRepository.findById(id);
//		if (Course.isPresent()) {
//			return ResponseEntity.ok(new DetalhesDoCourseIdDto(Course.get()));
//		}
//
//		return ResponseEntity.notFound().build();
//	}
	
//	@PutMapping("/{id}")
//	@Transactional
//	@CacheEvict(value = "listaDeCourses", allEntries = true)
//	public ResponseEntity<CourseIdDto> atualizar(@PathVariable Long id, @RequestBody @Valid AtualizacaoCourseForm form) {
//		Optional<Course> optional = CourseRepository.findById(id);
//		if (optional.isPresent()) {
//			Course Course = form.atualizar(id, CourseRepository);
//			return ResponseEntity.ok(new CourseIdDto(Course));
//		}
//
//		return ResponseEntity.notFound().build();
//	}
//
//	@DeleteMapping("/{id}")
//	@Transactional
//	@CacheEvict(value = "listaDeCourses", allEntries = true)
//	public ResponseEntity<?> remover(@PathVariable Long id) {
//		Optional<Course> optional = CourseRepository.findById(id);
//		if (optional.isPresent()) {
//			CourseRepository.deleteById(id);
//			return ResponseEntity.ok().build();
//		}
//
//		return ResponseEntity.notFound().build();
//	}

}